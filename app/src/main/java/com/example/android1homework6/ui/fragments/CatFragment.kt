package com.example.android1homework6.ui.fragments

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android1homework6.R
import com.example.android1homework6.Repositories.CarRepository
import com.example.android1homework6.data.CatModel
import com.example.android1homework6.databinding.FragmentCatBinding
import com.example.android1homework6.interfaces.OnItemClick
import com.example.android1homework6.ui.adapters.CatAdapter
import com.google.android.material.card.MaterialCardView
import org.w3c.dom.Text
import java.text.AttributedCharacterIterator.Attribute


class CatFragment() : Fragment() , OnItemClick {


    private var recyclerView: RecyclerView? = null
    private var repository = CarRepository()
    private var catAdapter = CatAdapter(this,repository.getLisOfCat())
    private lateinit var deleteAnimation: Animation
   private var image: ImageView? = null
   private var name: TextView? = null
    private var materialCardView: MaterialCardView? = null




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerView_catFragment)
        deleteAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.delite)
        image = view.findViewById(R.id.item_image_cat)
        name = view.findViewById(R.id.item_cat_text_status_code)
        materialCardView = view.findViewById(R.id.materialcardview_recyclerview)
        initialization()

    }

    private fun initialization() {
        val layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = catAdapter

    }

    override fun onShortClick(catModel: CatModel) {
       val catAddress: String = "https://http.cat/"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(catAddress + catModel.catId)
        startActivity(intent);

    }

    override fun onItemLongClick(position: Int) {
        recyclerView?.findViewHolderForAdapterPosition(position)?.itemView?.apply {
            startAnimation(deleteAnimation)
            animate().alpha(0f).setDuration(500).setListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    repository.getLisOfCat().removeAt(position)
                    catAdapter.notifyItemRemoved(position)
                }
            }).start()
        }
    }
}

