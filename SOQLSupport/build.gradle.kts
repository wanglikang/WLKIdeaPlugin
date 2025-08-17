plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "1.9.25"
  id("org.jetbrains.intellij") version "1.17.4"
}

group = "com.wlk.ideaPlugin"
version = "1.2.0"

repositories {
  mavenLocal()
  maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin") }
  maven { setUrl("https://maven.aliyun.com/repository/central") }
  maven { setUrl("https://maven.aliyun.com/repository/public") }
  mavenCentral()
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

  initializeIntelliJPlugin{
    // 跳过 Gradle 插件的各种检查，避免因为连不上github而报错
    // 参考：https://blog.csdn.net/u013205724/article/details/145830765
    selfUpdateCheck = false
  }
    buildSearchableOptions {
      enabled = false
    }

}
