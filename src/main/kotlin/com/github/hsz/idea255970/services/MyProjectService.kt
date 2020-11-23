package com.github.hsz.idea255970.services

import com.intellij.openapi.project.Project
import com.github.hsz.idea255970.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
