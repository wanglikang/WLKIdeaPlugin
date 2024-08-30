
plugins {
    // https://plugins.gradle.org/ 可以子这里找到合适的插件内容
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.0.20-Beta2"
    id("org.jetbrains.intellij") version "1.17.3"
}

group = "com.wlk.ideaPlugin"
version = "1.1.2"

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
}



dependencies {
    implementation("org.dom4j:dom4j:2.1.4")
    implementation("org.apache.xerces:xercesImpl:2.9.1")
    implementation("com.alibaba:fastjson:1.2.83_noneautotype")
    implementation("com.taobao.util:taobao-express:3.1.8")
    implementation("com.google.guava:guava:30.1-jre")
    implementation("org.apache.commons:commons-collections4:4.4")
//    使用本地的lib，避免按照插件的时候，还需要加载一会儿依赖
//    implementation(files("lib/common-collections4-4.4.jar","lib/fastjson-1.2.60.jar","lib/taobao-express-3.0.17.jar"))

//    用于发布到jetbrains仓库的时候签名
    // https://mvnrepository.com/artifact/org.jetbrains/marketplace-zip-signer
//    compileOnly("org.jetbrains:marketplace-zip-signer:0.1.24" )
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2024.1.4")
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
    sourceCompatibility = JavaVersion.VERSION_17
}


tasks {
//    // Set the JVM compatibility versions
//    withType<JavaCompile> {
//        sourceCompatibility = "17"
//        targetCompatibility = "17"
//    }

//    版本号对照关系：https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#platformVersions
    patchPluginXml {
//        203 ，要求java 11
//        222 ，要求java17
        sinceBuild.set("222")
        untilBuild.set("242.*")
    }

    signPlugin {
        certificateChainFile.set(file("private/chain.crt"))
        privateKeyFile.set(file("private/private.pem"))
//        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
        password.set("上面pem文件创建时候的密码")
    }

//    发布到集团的插件仓库，参考：https://aliyuque.antfin.com/jinji.lf/note/nngd38?
//    publishPlugin {
//      token.set("idea")
//        token.set("aone")
//实际测试无效，有问题，传不上去
//        正式仓库
//        host.set("https://ide.alibaba-inc.com")
//        测试的时候，发布到这个仓库
//        host.set("http://ide.alibsaba.net")
//    }

    runIde { 
        autoReloadPlugins = true
    }
}