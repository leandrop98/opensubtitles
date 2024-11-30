
# OpenSubtitles API Wrapper

---

## Overview
This is a Java-based API wrapper for [OpenSubtitles](https://www.opensubtitles.com/) that simplifies integration with their services. The wrapper provides a user-friendly interface to interact with OpenSubtitles' subtitle search and retrieval functionalities.

## Features
- Search for subtitles using various parameters.
- Search by movie hash, IMDb ID, TMDb ID, and more.
- Pagination support for results.
- Filter and sort subtitles by language, trusted sources, year, etc.

## Requirements
- Java 8 or higher.
- Maven or Gradle for dependency management.

## How to Include in Your Project

### Using JitPack
You can include this library in your project using JitPack. To do so:

1. **Add the JitPack repository to your `build.gradle` (or `pom.xml`):**

   **Gradle:**
   ```gradle
   repositories {
       maven { url 'https://jitpack.io' }
   }
   ```

   **Maven:**
   ```xml
   <repositories>
       <repository>
           <id>jitpack.io</id>
           <url>https://jitpack.io</url>
       </repository>
   </repositories>
   ```

   2. **Add the dependency:**

      **Gradle:**
      ```gradle
      dependencies {
          implementation 'com.github.leandrop98:opensubtitles:x.x.x'
      }
      ```

      **Maven:**
      ```xml
      <dependency>
         <groupId>com.github.leandrop98</groupId>
         <artifactId>opensubtitles</artifactId>
         <version>x.x.x</version>
      </dependency>
      ```

### Using GitHub
1. **Add the JitPack repository to your `build.gradle` (or `pom.xml`):**

   **Gradle:**
   ```gradle
   repositories {
       maven { url 'https://maven.pkg.github.com/leandrop98/opensubtitles' }
   }
   ```

2. **Add the dependency:**

   **Gradle:**
   ```gradle
   dependencies {
       implementation 'com.opensubtitles:opensubtitles:x.x.x'
   }
   ```

   **Maven:**
   ```xml
   <dependency>
     <groupId>com.opensubtitles</groupId>
     <artifactId>opensubtitles</artifactId>
     <version>0.0.1</version>
   </dependency>
   ```

## Usage Example
Here’s a simple example of how to use the API wrapper to search for subtitles:

```java
import opensubtitles.api.OpenSubtitlesService;
import opensubtitles.api.subtitles.SubtitleSearchRequest;

public class Main {
   public static void main(String[] args) {
      OpenSubtitlesService openSubtitlesService = new OpenSubtitlesService(System.getenv("TEST_API_KEY"), "appnametest", "v1.0.0");
      SubtitleSearchRequest request = new SubtitleSearchRequest("iron", "en");
      SubtitleSearchResponse res = openSubtitlesService.searchSubtitles(request);
   }
}
```

## Contributing
1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/awesome-feature`).
3. Commit your changes (`git commit -am 'Add awesome feature'`).
4. Push to the branch (`git push origin feature/awesome-feature`).
5. Open a Pull Request.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

---
