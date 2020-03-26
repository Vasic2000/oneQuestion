package jp.vasic2000.a2questions.ui.trains

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jp.vasic2000.a2questions.R
import jp.vasic2000.a2questions.ui.trains.DataTrain
import jp.vasic2000.a2questions.ui.trains.TrainAdapter

class TrainFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_train, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)

        val layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        val data = DataTrain()
        val myAdapter = TrainAdapter(data.getDataList())
        recyclerView.adapter = myAdapter
        return view
    }
}
