package com.vkraevskiy.budgettracker.core

import android.app.Application
import com.vkraevskiy.budgettracker.core.bridge.DbBridge
import com.vkraevskiy.budgettracker.db.DbFacade

class BTApplication : Application() {

    val dbBridge: DbBridge
        get() = DbFacade()


}