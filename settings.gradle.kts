pluginManagement {
    repositories {
        maven { url=uri("https://maven.aliyun.com/repository/public") }
        maven { url=uri("https://maven.aliyun.com/repository/central")  }
        maven { url=uri("https://maven.aliyun.com/repository/gradle-plugin")  }
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { url=uri("https://maven.aliyun.com/repository/public") }
        maven { url=uri("https://maven.aliyun.com/repository/central")  }
        google()
        mavenCentral()
        maven { url=uri("https://mirrors.tencent.com/repository/maven/tencent_public/") }
        maven { url=uri("https://mirrors.tencent.com/repository/maven/tencent_public_snapshots") }
        // 补充：腾讯地图SDK依赖的其他仓库（按官方要求添加）
        maven { url=uri("https://oss.sonatype.org/content/groups/public") }
        maven { url=uri("https://oss.sonatype.org/content/repositories/snapshots/") }
        maven {
            url = uri("https://mirrors.tencent.com/nexus/repository/maven-public/")
        }
    }
}

rootProject.name = "JnuExperiment2025"
include(":app")
 