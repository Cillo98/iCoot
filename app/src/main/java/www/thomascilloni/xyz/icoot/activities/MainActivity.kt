package www.thomascilloni.xyz.icoot.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import www.thomascilloni.xyz.icoot.R
import www.thomascilloni.xyz.icoot.utils.Constants

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_browse -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_reservations -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_rentals -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_account -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        checkLogin()

        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    /**
     * Check if the user has logged in.
     * The check is done in the sharedPreferences. If the user hasn't logged in yet,
     * the login activity will be launched
     */
    private fun checkLogin() {
        val prefs = applicationContext.getSharedPreferences(Constants.PREFS_NAME, 0) // 0 gives private mode

        // check the shared preferences. Default value for login is false (in case it does not exist)
        if (!prefs.getBoolean(Constants.PREFS_LOGGED_IN, false))
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        else
            Toast.makeText(this, "Logged in", Toast.LENGTH_SHORT).show()

    }
}
