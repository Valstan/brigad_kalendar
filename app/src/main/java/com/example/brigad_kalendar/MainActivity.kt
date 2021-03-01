package com.example.brigad_kalendar

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.brigad_kalendar.databinding.ActivityMainBinding
import com.example.brigad_kalendar.db.MyAdapter
import com.example.brigad_kalendar.db.MyDbManager

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val myDbManager = MyDbManager(this)
    val myAdapter = MyAdapter(ArrayList())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    override fun onResume() {
        super.onResume()
        myDbManager.openDB()
        fillAdapter()
    }

    fun onClickChat(view: View){

        val i = Intent(this, ChatBrigadir::class.java)
        startActivity(i)
    }

    override fun onDestroy() {
        super.onDestroy()
        myDbManager.closeDB()
    }

    fun init() {
        binding.rcList.layoutManager = LinearLayoutManager(this)
        binding.rcList.adapter = myAdapter
    }

    fun fillAdapter() {
        myAdapter.updateAdapter(myDbManager.readDbData())
    }
}
