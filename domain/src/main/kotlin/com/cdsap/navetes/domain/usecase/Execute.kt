package com.cdsap.navetes.domain.usecase

import com.cdsap.navetes.domain.entities.Pod

interface Execute {
    fun execute(pod: Pod, command: String)
}