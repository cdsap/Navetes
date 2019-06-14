package com.cdsap.navetes.domain.repository

import com.cdsap.navetes.domain.entities.Pod

interface GetPods {
    fun getPods(): List<Pod>
}