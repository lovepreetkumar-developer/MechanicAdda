package com.techfathers.mechanic_adda

import android.app.Application
import com.techfathers.mechanic_adda.data.network.FCMApis
import com.techfathers.mechanic_adda.data.network.NetworkConnectionInterceptor
import com.techfathers.mechanic_adda.data.preferences.PreferenceProvider
import com.techfathers.mechanic_adda.data.respositories.CommonRepository
import com.techfathers.mechanic_adda.ui.custom_views.circle_progress.CustomProgress
import com.techfathers.mechanic_adda.util.FieldsValidator
import com.techfathers.mechanic_adda.vm_factories.GifDetailsViewModelFactory
import com.techfathers.mechanic_adda.vm_factories.HomeViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import timber.log.Timber
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class MainApplication : Application(), KodeinAware {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

    override val kodein = Kodein.lazy {

        import(androidXModule(this@MainApplication))
        bind() from singleton { CustomProgress() }
        bind() from singleton { FieldsValidator() }
        bind() from singleton { NetworkConnectionInterceptor(instance()) }
        bind() from singleton { FCMApis(instance()) }
        bind() from singleton { PreferenceProvider(instance()) }
        bind() from singleton { CommonRepository(instance()) }
        bind() from singleton { HomeViewModelFactory(instance()) }
        bind() from singleton { GifDetailsViewModelFactory(instance()) }
    }
}