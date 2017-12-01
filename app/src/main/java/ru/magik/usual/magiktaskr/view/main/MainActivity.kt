package ru.magik.usual.magiktaskr.view.main

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import ru.magik.usual.magiktaskr.R
import ru.magik.usual.magiktaskr.logic.MainLogic

class MainActivity : AppCompatActivity(), MainView {
    override fun showAddTaskrItemDlg(view: View) {
        Snackbar.make(view, "There must be add taskr item dlg", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
    }

    override fun showAddGroupDlg(view: View) {
        Snackbar.make(view, "There must be add group item dlg", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
    }

    val logic: MainLogic = MainLogic(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { callbackView ->
            logic.createNewTaskrItem(callbackView)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}

interface MainView {
    fun showAddTaskrItemDlg(view: View)
    fun showAddGroupDlg(view: View)
}
