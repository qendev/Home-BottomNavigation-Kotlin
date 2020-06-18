package com.example.homebottomnavigation_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mtextView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setSupportActionBar(my_toolbar)

        // set the listener to the BottomNavigationView and pass the listener item to it.
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)




        /*When our application first opens,
        we need to set one of the items already selected to show on the screen.
        We will check if our savedInstanceState is null we will set one of the fragments.*/
        if (savedInstanceState == null) {
            val fragment = HomeFragment()
            supportFragmentManager.beginTransaction().replace(R.id.my_container, fragment, fragment.javaClass.getSimpleName())
                .commit()
        }

    }
    //get the lister item and pass the bottomNavigationView

    //Here, we are checking which item user will select and what action to perform on click.
    // So, on clicking the item, we are getting the fragment instance and placing the fragment into the FrameLayout.
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
        when (menuItem.itemId) {
            R.id.nav_home -> {
                val fragment = HomeFragment()
                supportFragmentManager.beginTransaction().replace(R.id.my_container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_dashboard -> {
                val fragment = DashboardFragment()
                supportFragmentManager.beginTransaction().replace(R.id.my_container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_posts -> {
                val fragment = PostsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.my_container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_notifications -> {
                val fragment =NotificationsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.my_container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }











}