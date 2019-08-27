package _Action

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.android_0.R

class CustomAdapter(context: Context, arrayListString: Array<String>): BaseAdapter() {
    var context = context
    var arrayListString = arrayListString

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var myView = convertView
        var holder: ViewHolder
        if (myView == null) {
            val mInflater = (context as Activity).layoutInflater
            myView = mInflater.inflate(R.layout.itm, parent, false)
            holder = ViewHolder()
            holder.mTextView = myView!!.findViewById<TextView>(R.id.textView) as TextView
            myView.setTag(holder)
        } else {
            holder = myView.getTag() as ViewHolder
        }
        holder.mTextView!!.setText(arrayListString.get(position))
        return myView
    }

    override fun getItem(p0: Int): Any {
        return arrayListString.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return arrayListString.size
    }

    class ViewHolder {
        var mTextView: TextView? = null
    }
}