plugins {
    // https://plugins.gradle.org/ 可以子这里找到合适的插件内容
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.9.24"
    id("org.jetbrains.intellij") version "1.17.3"
}

group = "com.wlk.ideaPlugin"
version = "1.1.3"

repositories {
    //优先使用本地的maven仓库地址
    mavenLocal()
    mavenCentral()
    maven {
        setUrl("https://maven.aliyun.com/nexus/content/groups/public/")
        setUrl("https://maven.aliyun.com/repository/public/")
        setUrl("https://maven.aliyun.com/repository/central")
        setUrl("https://maven.aliyun.com/repository/gradle-plugin")
        setUrl("https://maven.aliyun.com/repository/spring-plugin")
    }
//    intellijPlatform {
//        defaultRepositories()
//    }
}



dependencies {
    implementation("org.dom4j:dom4j:2.1.4")
    implementation("org.apache.xerces:xercesImpl:2.9.1")
    implementation("com.alibaba:fastjson:1.2.83_noneautotype")
//    implementation("com.taobao.util:taobao-express:3.1.9")
    implementation("com.alibaba:QLExpress:3.3.3")
    implementation("com.google.guava:guava:30.1-jre")
    implementation("org.apache.commons:commons-collections4:4.4")
//    使用本地的lib，避免按照插件的时候，还需要加载一会儿依赖
//    implementation(files("lib/common-collections4-4.4.jar","lib/fastjson-1.2.60.jar","lib/taobao-express-3.0.17.jar"))

//    用于发布到jetbrains仓库的时候签名
    // https://mvnrepository.com/artifact/org.jetbrains/marketplace-zip-signer
    compileOnly("org.jetbrains:marketplace-zip-signer:0.1.24" )

//    // 2.x   版本的的配置，移到了这里
//    intellijPlatform {
////        val type = providers.gradleProperty("platformType")
////        val version = providers.gradleProperty("platformVersion")
//
//        intellijIdeaCommunity("2024.2.0.1")
////        create("IC", "2024.2.0.2")
//// 上面两行，是两种定义目标平台的方法
//
////        intellijIdeaUltimate("2024.2.0.1")
//        bundledPlugin("com.intellij.java")
//
////        plugins(providers.gradleProperty("platformPlugins").map { it.split(',') })
////        bundledPlugins(providers.gradleProperty("platformBundledPlugins").map { it.split(',') })
//        jetbrainsRuntime()
//        javaCompiler()
//    }
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
// 1.x 版本的配置
intellij {
    version.set("2024.2.0.2")
//    type.set("IC") // Target IDE Platform
    type.set("IU") // AI, CL, GW, GO, IC, IU, PS, PY, PC, RD
    plugins.set(listOf(/* Plugin Dependencies */))
}

idea{
    module{
        setDownloadJavadoc(true)
        setDownloadSources(true)
    }
}
java {
// 执行编译java的编译器版本
    sourceCompatibility = JavaVersion.VERSION_17

//    编译的目标class 的版本，为了兼容更新的版本
    // sourceCompatibility 应该小于等于 targetCompatibility
    //targetCompatibility 不能比当前使用的gradle使用的java 版本大
    targetCompatibility = JavaVersion.VERSION_17
}


tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

//    版本号对照关系：https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#platformVersions
    patchPluginXml {
//        203 ，要求java 11
//        222 ，要求java 17
//        242 ，要求java 21
        sinceBuild.set("222")
//        untilBuild.set("242.*")
    }

    signPlugin {
        certificateChainFile.set(file("private/chain.crt"))
        privateKeyFile.set(file("private/private.pem"))
        password.set(System.getenv("INTELLIJ_PRIVATE_KEY_PASSWORD"))

    }


// 发布到Jetbrasin到市场
    publishPlugin {
        token.set(System.getenv("ORG_GRADLE_PROJECT_intellijPublishToken"))
        channels.set(listOf("beta"))
//        alpha: https://plugins.jetbrains.com/plugins/alpha/list
//        beta: https://plugins.jetbrains.com/plugins/beta/list
//        eap: https://plugins.jetbrains.com/plugins/eap/list
//        canary:   https://plugins.jetbrains.com/plugins/canary/list
    }
}