package com.cdsap.navetes.domain.usecase

import com.cdsap.navetes.domain.entities.Pod

interface CloneRepository {
    fun clone(pod: Pod, repository: String)
}