package com.cdsap.navetes.domain.usecase

import com.cdsap.navetes.domain.entities.Pod

interface GetPods {
    fun get(): List<Pod>
}