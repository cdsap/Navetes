package com.cdsap.navetes.domain.impl

import com.cdsap.navetes.domain.entities.Pod
import com.cdsap.navetes.domain.usecase.GetPods

class GetPodsImpl(val repository: com.cdsap.navetes.domain.repository.GetPods) : GetPods {
    override fun get(): List<Pod> {
        return repository.getPods()
    }

}