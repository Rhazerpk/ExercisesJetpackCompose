package com.kotlin.bottomnavigation

sealed class Destination(val route: String, val icon: Int, val title: String) {
    object Transaction : Destination(
        route = "transactions", icon = R.drawable.baseline_wallet_24,
        title = "Transactions"
    )

    object Budgets : Destination(
        route = "budget", icon = R.drawable.baseline_account_balance_wallet_24,
        title = "Budget"
    )

    object Tasks : Destination(route = "tasks", icon = R.drawable.baseline_add_task_24, title = "Tasks")
    object Settings : Destination(
        route = "settings", icon = R.drawable.baseline_settings_24,
        title = "Settings"
    )

    companion object {
        val toList = listOf(Transaction, Budgets, Tasks, Settings)
    }
}