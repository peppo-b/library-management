# Library Management
Applicazione Java per la gestione del catalogo di una libreria.

## Requisiti
* Java 21
* Maven 3.9+
* Account GitHub
* Personal Access Token GitHub con permesso `read:packages`

## Clonazione del progetto
```bash
git clone https://github.com/peppo-b/library-management.git
cd library-management
```

## Configurazione GitHub Packages
Il progetto utilizza la libreria esterna:

```xml
it.corso:library-core:1.0-SNAPSHOT
```

pubblicata tramite GitHub Packages.
### 1. Creare un Personal Access Token

Da GitHub:
```text
Settings
→ Developer settings
→ Personal access tokens
→ Tokens (classic)
```

Creare un token con almeno il permesso:
```text
read:packages
```

### 2. Configurare Maven
Creare o modificare il file:
```text
C:\Users\<username>\.m2\settings.xml
```

Inserendo:

```xml
<settings>
    <servers>
        <server>
            <id>github</id>
            <username>USERNAME_GITHUB</username>
            <password>PERSONAL_ACCESS_TOKEN</password>
        </server>
    </servers>
</settings>
```

### 3. Configurazione del repository Maven

Nel file `pom.xml` è già configurato:

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/gitnicohub/library-core</url>
    </repository>
</repositories>
```

## Installazione dipendenze

Forzare il download delle dipendenze:

```bash
mvn clean install -U
```

## Esecuzione

Compilazione:

```bash
mvn clean package
```

Avvio:

```bash
mvn exec:java
```

oppure tramite IntelliJ IDEA eseguendo la classe `Main`.

## Struttura Branch

```text
main
│
├── develop
│
├── feature/visualizzazione-catalogo
├── feature/gestione-prestiti
└── feature/...
```

## Team

* Team 1: sviluppo libreria `library-core`
* Team 2: sviluppo applicazione `library-management` utilizzando la dependency Maven pubblicata su GitHub Packages.
