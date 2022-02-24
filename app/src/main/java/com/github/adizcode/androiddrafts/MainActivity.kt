package com.github.adizcode.androiddrafts

import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.setPadding
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

val list = listOf(Draft("Test", MainActivity::class.java), Draft("Test", MainActivity::class.java))

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = DraftAdapter(list)
        val layoutManager = GridLayoutManager(this, 2)
        findViewById<RecyclerView?>(R.id.recycler_view)
            .also {
                it.adapter = adapter
                it.layoutManager = layoutManager
                it.addItemDecoration(SpacesItemDecoration(32))
            }
    }
}


/**
 * Credit: Mark Hetherington
 * StackOverflow: https://stackoverflow.com/questions/28531996/android-recyclerview-gridlayoutmanager-column-spacing
 */
class SpacesItemDecoration(space: Int) : RecyclerView.ItemDecoration() {
    private val halfSpace = space / 2

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        with(parent) {
            if (!(paddingStart == paddingEnd && paddingStart == paddingTop && paddingStart == paddingBottom && paddingStart == halfSpace)) {
                setPadding(halfSpace)
                clipToPadding = false
            }
        }

        with(outRect) {
            left = halfSpace
            right = halfSpace
            top = halfSpace
            bottom = halfSpace
        }
    }
}