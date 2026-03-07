group = "li.auna"

patches {
    about {
        name = "Plus Experiments"
        description = "A collection of patches for Telegram clients"
        source = "git@github.com:r7reiz/PlusExperiments.git"
        author = "Reis"
        license = "GNU General Public License v3.0"
    }
}

dependencies {
    compileOnly(project(":patches:stub"))
}

kotlin {
    compilerOptions {
        freeCompilerArgs = listOf("-Xcontext-receivers")
    }
}