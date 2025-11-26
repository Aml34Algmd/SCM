# Release Notes

This file contains the changelog for all releases of the FileUtility tool.

## Version 1.0 (Initial Release)

**Release Date:** November 26, 2025

### Features
- Initial project setup
- Line counting functionality for text files
- Basic command-line interface
- Help command for usage information

### Changes
- Created main FileUtility class
- Implemented `countLines()` method for counting lines in files
- Added README documentation
- Set up project structure with proper Java package organization
- Added sample.txt for testing

---

## Version 1.1

**Release Date:** November 26, 2025

### Features
- Word counting functionality for text files
- File search functionality with recursive directory search
- Enhanced command-line interface with multiple operations
- Improved version information display

### Changes
- Added `countWords()` method for counting words in files
- Implemented `searchFile()` method with recursive directory traversal
- Added `searchFilesRecursive()` helper method for deep file searching
- Updated version number to 1.1 in usage information
- Merged feature branches (word-count and file-search) into main
- Resolved merge conflicts during feature integration

### New Commands
- `count-words <file>` - Count the number of words in a file
- `search-file <dir> <pattern>` - Search for files matching pattern in directory (recursive)

---
