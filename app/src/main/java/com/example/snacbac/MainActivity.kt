package com.example.snacbac

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.snacbac.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

    fun first(view: View) {
        Snackbar.make(view, R.string.tbut01, Snackbar.LENGTH_LONG).show()
    }

    fun second(view: View) {
        val snackbar = Snackbar.make(view,R.string.tbut11,Snackbar.LENGTH_INDEFINITE)
        snackbar.setAction(R.string.tbut12, View.OnClickListener(){
            Snackbar.make(view,R.string.tbut13,Snackbar.LENGTH_LONG).show()
        })
        snackbar.show()
    }

    fun third(view: View) {
        val snackbar = Snackbar.make(view,R.string.tbut21,1)
        snackbar.show()
    }

}