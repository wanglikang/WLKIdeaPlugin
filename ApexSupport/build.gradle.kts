plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "1.9.25"
  id("org.jetbrains.intellij") version "1.17.4"
//  id("org.jetbrains.intellij.platform") version "2.2.0"
}

group = "com.wlk.ideaPlugin"
version = "1.0-SNAPSHOT"

// 使用init.gradle 去配置全局的加速
repositories {
  mavenLocal()
  maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin") }
  maven { setUrl("https://maven.aliyun.com/repository/central") }
  maven { setUrl("https://maven.aliyun.com/repository/public") }
  mavenCentral()
}

//dependencies {
//  implementation("com.jetbrains:ideaIC:2024.2.3")
//}

// Include the generated files in the source set
sourceSets {
  main {
    java {
      srcDirs("src/main/gen")
      srcDirs("src/main/java")
    }
  }
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
  version.set("2024.2.3")
  type.set("IC") // Target IDE Platform

  plugins.set(listOf(/* Plugin Dependencies */))
}

tasks {
  // Set the JVM compatibility versions
  withType<JavaCompile> {
    sourceCompatibility = "17"
    targetCompatibility = "17"
  }
  withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
  }

  patchPluginXml {
    sinceBuild.set("232")
    untilBuild.set("242.*")
  }

  signPlugin {
    certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
    privateKey.set(System.getenv("PRIVATE_KEY"))
    password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
  }

  publishPlugin {
    token.set(System.getenv("PUBLISH_TOKEN"))
  }
}

//var HOME_PATH = "/Users/bytedance"
var HOME_PATH = "/Users/wanglikang"
var PROJECT_PATH = HOME_PATH+"/GithubProjects/WLKIdeaPlugin/ApexSupport"
tasks.register<JavaExec>("ApexLexerRunTask") {
  mainClass.set("com.wlk.ideaplugin.apexsupport.language.parser.ApexLexer")
  classpath = sourceSets["main"].runtimeClasspath
  // 假设引入的类在包 com.jetbrains.somepackage 中
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/annotations.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/app-client.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/app.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/bouncy-castle.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/external-system-rt.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/externalProcess-rt.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/forms_rt.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/groovy.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/idea_rt.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/intellij-test-discovery.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/jps-model.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/jsch-agent.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/junit4.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/lib-client.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/lib.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/nio-fs.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/opentelemetry.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/platform-loader.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/protobuf.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/rd.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/stats.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/testFramework.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/trove.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/util-8.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/util.jar")
  classpath += files(HOME_PATH+ "/.gradle/caches/modules-2/files-2.1/com.jetbrains.intellij.idea/ideaIC/2024.2.3/7005e31eb47174334247f5590dc54933dceddbea/ideaIC-2024.2.3/lib/util_rt.jar")



  args(PROJECT_PATH+"/src/main/java/com/wlk/ideaplugin/apexsupport/grammar/TestApexClass.cls")
}

