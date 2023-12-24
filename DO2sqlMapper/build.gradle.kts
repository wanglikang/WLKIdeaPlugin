plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.15.0"
}

group = "com.wlk.ideaPlugin"
version = "1.0-SNAPSHOT"

repositories {


    mavenLocal()
    mavenCentral()
    maven {
        // setUrl("https://maven.aliyun.com/nexus/content/groups/public/")
        setUrl("https://maven.aliyun.com/repository/public/")
        setUrl("https://maven.aliyun.com/repository/gradle-plugin")
    }


}

dependencies {
//    implementation("com.alibaba:fastjson:1.2.60")
//    implementation("com.taobao.util:taobao-express:3.0.17")
//    implementation("org.apache.commons:commons-collections4:4.4")
//    使用本地的lib，避免按照插件的时候，还需要加载一会儿依赖
    implementation(files("lib/fastjson-1.2.60.jar"))
}


// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2022.3.3")
    type.set("IC") // Target IDE Platform

    plugins.set(listOf(/* Plugin Dependencies */))
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    patchPluginXml {
        sinceBuild.set("221")
        untilBuild.set("233.*")
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
