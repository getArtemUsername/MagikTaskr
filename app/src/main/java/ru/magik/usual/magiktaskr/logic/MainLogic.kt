package ru.magik.usual.magiktaskr.logic

import android.view.View
import ru.magik.usual.magiktaskr.view.main.MainView

/**
 * Created by klevakin on 01.12.17.
 */
class MainLogic(val view: MainView) {
    fun createNewTaskrItem(callbackView: View) {
        view.showAddTaskrItemDlg(callbackView)
    }
}