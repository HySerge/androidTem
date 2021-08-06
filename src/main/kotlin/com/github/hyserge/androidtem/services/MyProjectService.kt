package com.github.hyserge.androidtem.services

import com.github.hyserge.androidtem.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
