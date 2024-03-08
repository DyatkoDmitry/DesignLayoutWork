package com.example.designlayoutwork

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.designlayoutwork.readyScreenModel.Profile

class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Only choose one method check*

        //checkElementCentringLayout()
        //checkScrollViewHandlingLayout()
        //checkViewSquareLayout()
        checkReadyMadeScreenLayout()
    }

    private fun checkElementCentringLayout(){
        setContentView(R.layout.element_centring)
    }

    private fun checkScrollViewHandlingLayout(){
        setContentView(R.layout.scroll_view_handling)

        val view:View = findViewById(R.id.contentView)
        val button: Button = findViewById(R.id.contentButton)

        button.setOnClickListener {
            view.layoutParams.height = getHeightView()
            view.requestLayout()
        }
    }

    private fun getHeightView(): Int{
        return try {
            val editText: EditText = findViewById(R.id.heightEditText)
            Integer.parseInt(editText.text.toString())
        }
        catch (e: Exception ){
            0
        }
    }

    private fun checkViewSquareLayout(){
        setContentView(R.layout.view_square)
    }

    private fun checkReadyMadeScreenLayout(){
        setContentView(R.layout.ready_made_screen)

        viewModel.currentProfile.observe(this, Observer {
           setProfileView(it)
        })
    }

    private fun setProfileView(profile: Profile){
        val mainDrawable = createDrawable(profile.img)

        findViewById<ImageView>(R.id.mainImage).setImageDrawable(mainDrawable)
        findViewById<TextView>(R.id.title).setText(profile.title)
        findViewById<TextView>(R.id.personsName).setText(profile.name)
        findViewById<TextView>(R.id.grade).setText(profile.grade.toString())
        findViewById<TextView>(R.id.amountReviews).setText(profile.amountReviews.toString())
        findViewById<TextView>(R.id.amountLikes).setText(profile.amountLikes.toString())
        findViewById<TextView>(R.id.lastVisitDays).setText("${profile.lastVisitDays} ${getString(R.string.days_ago)} ")
        findViewById<TextView>(R.id.recUsers).setText("${profile.recomendedUsersAmount} / ${profile.allUsersAmount} ${getString(R.string.users_rec)}")
        findViewById<TextView>(R.id.yetUsersAmount).setText("+${profile.allUsersAmount - profile.recomendedUsersAmount - 4}")

        Glide.with(this)
            .load(mainDrawable)
            .centerCrop()
            .into(findViewById<ImageView>(R.id.personGirlIcon))

        Glide.with(this)
            .load(getRecommendedUser())
            .centerCrop()
            .into(findViewById(R.id.ic1))

        Glide.with(this)
            .load(getRecommendedUser())
            .centerCrop()
            .into(findViewById(R.id.ic2))

        Glide.with(this)
            .load(getRecommendedUser())
            .centerCrop()
            .into(findViewById(R.id.ic3))

        Glide.with(this)
            .load(getRecommendedUser())
            .centerCrop()
            .into(findViewById(R.id.ic4))
    }

    private fun getRecommendedUser() = createDrawable(viewModel.recommendedUsersIcons.getRandomRecUser())

    private fun createDrawable(identifier: String): Drawable? = getDrawable(resources.getIdentifier(identifier,"drawable",getPackageName()))

}