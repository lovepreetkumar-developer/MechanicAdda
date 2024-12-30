package com.techfathers.mechanic_adda.vm_factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.techfathers.mechanic_adda.data.respositories.CommonRepository
import com.techfathers.mechanic_adda.view_models.GifDetailsViewModel

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

@Suppress("UNCHECKED_CAST")
class GifDetailsViewModelFactory(
    private val repository: CommonRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GifDetailsViewModel(repository) as T
    }
}