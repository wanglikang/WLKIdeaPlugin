plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.7.20"
    id("org.jetbrains.intellij") version "1.15.0"
}

group = "com.wlk.ideaPlugin"
version = "1.0-SNAPSHOT"

repositories {
    //优先使用本地的maven仓库地址
    mavenLocal()
    mavenCentral()
    maven {
//        setUrl("https://maven.aliyun.com/nexus/content/groups/public/")
        setUrl("https://maven.aliyun.com/repository/public/")
        setUrl("https://maven.aliyun.com/repository/gradle-plugin")
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

dependencies {
//    implementation("com.alibaba:fastjson:1.2.60")
//    implementation("com.taobao.util:taobao-express:3.0.17")
//    implementation("org.apache.commons:commons-collections4:4.4")
//    使用本地的lib，避免按照插件的时候，还需要加载一会儿依赖
    implementation(files("lib/common-collections4-4.4.jar","lib/fastjson-1.2.60.jar","lib/taobao-express-3.0.17.jar"))

//    用于发布到jetbrains仓库的时候签名
    // https://mvnrepository.com/artifact/org.jetbrains/marketplace-zip-signer
//    compileOnly("org.jetbrains:marketplace-zip-signer:0.1.24" )
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
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

    patchPluginXml {
        sinceBuild.set("221")
        untilBuild.set("233.*")
    }

    signPlugin {
        certificateChainFile.set(file("private/chain.crt"))
        privateKeyFile.set(file("private/private.pem"))
//        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
        password.set("上面pem文件创建时候的密码")
    }

//    发布到集团的插件仓库，参考：https://aliyuque.antfin.com/jinji.lf/note/nngd38?
    publishPlugin {
//      token.set("idea")
        token.set("aone")
//实际测试无效，有问题，传不上去
//        正式仓库
//        host.set("https://ide.alibaba-inc.com")
//        测试的时候，发布到这个仓库
        host.set("http://ide.alibsaba.net")
    }

    runIde {
        autoReloadPlugins = true
    }
}