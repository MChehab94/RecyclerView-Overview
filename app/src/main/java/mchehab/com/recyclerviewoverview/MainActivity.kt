package mchehab.com.recyclerviewoverview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<Model>()
        for(i in 1..100){
            list.add(Model("Item #$i"))
        }
        linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val adapter = Adapter(list)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.addItemDecoration(DividerItemDecoration(this, linearLayoutManager
                .orientation))
    }
}