# FileUtility - Java File Utility Tool

A simple Java utility tool for basic file operations and analysis.

## Overview

FileUtility is a command-line Java application that provides various file manipulation and analysis capabilities. This tool helps developers perform common file operations quickly and efficiently.

## Features

- **Line Counting**: Count the total number of lines in a text file
- More features coming soon!

## Requirements

- Java JDK 8 or higher
- Git (for version control)

## Installation

1. Clone this repository:
```bash
git clone <your-repository-url>
cd SCM
```

2. Compile the Java source files:
```bash
javac -d bin src/main/java/com/scm/util/FileUtility.java
```

## Usage

### Count Lines in a File

To count the number of lines in a file:

```bash
java -cp bin com.scm.util.FileUtility count-lines <file-path>
```

**Example:**
```bash
java -cp bin com.scm.util.FileUtility count-lines README.md
```

### Help

To see available commands:

```bash
java -cp bin com.scm.util.FileUtility help
```

## Project Structure

```
SCM/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── scm/
│                   └── util/
│                       └── FileUtility.java
├── bin/                    # Compiled classes (generated)
├── README.md
└── .gitignore
```

## Development

This project is part of a Software Configuration Management (SWE 442) course project. It demonstrates version control practices using Git and GitHub.

## Contributing

This is an academic project. For questions or issues, please contact the project maintainers.

## License

This project is for educational purposes only.

## Authors

- Mekhled Alharbi

## Version History

- **v1.0** - Initial release with line counting feature

