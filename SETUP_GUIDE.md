# 🛠️ Machine Setup Guide — REST Assured API Automation Workshop

Welcome! Before the session, please set up the following tools on your machine so you can follow along with the hands-on demo.

---

## 1. Java Development Kit (JDK) 11

The project is compiled with **Java 11**. We recommend installing **JDK 11** (LTS).

### Installation

| OS | Instructions                                                                                                                                    |
|---|-------------------------------------------------------------------------------------------------------------------------------------------------|
| **Windows** | Download the installer from [https://adoptium.net/temurin/releases/?version=11]() and run it. Make sure the installer sets `JAVA_HOME` for you. |
| **macOS** | `brew install --cask temurin` (requires [Homebrew](https://brew.sh/))                                                                           |
| **Linux (Debian/Ubuntu)** | `sudo apt update && sudo apt install openjdk-11-jdk`                                                                                            |

### Verify

Open a terminal and run:

```bash
java -version
```

You should see version **11**.

---

## 2. Apache Maven 3.9+

Maven is the build tool used to compile the project, manage dependencies, and run tests.

### Installation

| OS | Instructions |
|---|---|
| **Windows** | Download the binary zip from [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi). Extract it and add the `bin` folder to your system `PATH`. |
| **macOS** | `brew install maven` |
| **Linux (Debian/Ubuntu)** | `sudo apt install maven` |

### Verify

```bash
mvn -version
```

You should see Maven **3.9+** and the JDK version it is using.

---

## 3. IDE — IntelliJ IDEA (recommended)

We will be using **IntelliJ IDEA** during the demo. The **Community Edition** is free and sufficient.

- Download from: [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
- During installation, accept defaults.
- On first launch, IntelliJ will detect the JDK and Maven automatically.

> **Alternative IDEs:** VS Code (with the *Extension Pack for Java*) or Eclipse will also work.

---

## 4. Git (optional but recommended)

If you want to clone the project repository instead of downloading a zip:

| OS | Instructions |
|---|---|
| **Windows** | Download from [https://git-scm.com/download/win](https://git-scm.com/download/win) |
| **macOS** | `brew install git` or install Xcode Command Line Tools |
| **Linux** | `sudo apt install git` |

### Verify

```bash
git --version
```

---

## Quick Checklist

| # | Tool | Minimum Version | Check Command |
|---|---|---|---|
| 1 | JDK | 11+ | `java -version` |
| 2 | Maven | 3.9+ | `mvn -version` |
| 3 | IntelliJ IDEA (Community) | Latest | — |
| 4 | Git *(optional)* | Any | `git --version` |

---

See you there! 🚀

