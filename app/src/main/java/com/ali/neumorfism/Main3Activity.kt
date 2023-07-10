package com.ali.neumorfism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Visibility
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.ali.neumorfism.databinding.ActivityMain3Binding
import soup.neumorphism.ShapeType

class Main3Activity : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.neumorphCardView.setOnClickListener {

            binding.neumorphCardView.setShapeType(ShapeType.PRESSED)
            binding.imgNeumorphCardView.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.Blue_light
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView2.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView2.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView3.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView3.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView4.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView4.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

        }
        binding.neumorphCardView2.setOnClickListener {

            binding.neumorphCardView.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView2.setShapeType(ShapeType.PRESSED)
            binding.imgNeumorphCardView2.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.Blue_light
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView3.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView3.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView4.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView4.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

        }
        binding.neumorphCardView3.setOnClickListener {

            binding.neumorphCardView.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView2.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView2.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView3.setShapeType(ShapeType.PRESSED)
            binding.imgNeumorphCardView3.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.Blue_light
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView4.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView4.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

        }
        binding.neumorphCardView4.setOnClickListener {

            binding.neumorphCardView.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView2.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView2.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView3.setShapeType(ShapeType.FLAT)
            binding.imgNeumorphCardView3.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.text_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

            binding.neumorphCardView4.setShapeType(ShapeType.PRESSED)
            binding.imgNeumorphCardView4.setColorFilter(
                ContextCompat.getColor(
                    this,
                    R.color.Blue_light
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )

        }


        binding.horizontalNeumorphCardView1.setOnClickListener {
            if (binding.imgHorizontalNeumorphCardView1.isVisible) {
                binding.imgHorizontalNeumorphCardView1.visibility = View.INVISIBLE
                binding.txtHorizontalNeumorphCardView1.text = "Sleeping mode"
            } else {
                binding.imgHorizontalNeumorphCardView1.visibility = View.VISIBLE
                binding.txtHorizontalNeumorphCardView1.text = "Turned on"
            }
        }
        binding.horizontalNeumorphCardView2.setOnClickListener {
            if (binding.imgHorizontalNeumorphCardView2.isVisible) {
                binding.imgHorizontalNeumorphCardView2.visibility = View.INVISIBLE
                binding.txtHorizontalNeumorphCardView2.text = "A/C is off"
            } else {
                binding.imgHorizontalNeumorphCardView2.visibility = View.VISIBLE
                binding.txtHorizontalNeumorphCardView2.text = "A/C on"
            }
        }
        binding.horizontalNeumorphCardView3.setOnClickListener {
            if (binding.imgHorizontalNeumorphCardView3.isVisible) {
                binding.imgHorizontalNeumorphCardView3.visibility = View.INVISIBLE
                binding.txtHorizontalNeumorphCardView3.text = "High pressure"
            } else {
                binding.imgHorizontalNeumorphCardView3.visibility = View.VISIBLE
                binding.txtHorizontalNeumorphCardView3.text = "Low pressure"
            }
        }
        binding.horizontalNeumorphCardView4.setOnClickListener {
            if (binding.imgHorizontalNeumorphCardView4.isVisible) {
                binding.imgHorizontalNeumorphCardView4.visibility = View.INVISIBLE
                binding.txtHorizontalNeumorphCardView4.text = "Automatic mode"
            } else {
                binding.imgHorizontalNeumorphCardView4.visibility = View.VISIBLE
                binding.txtHorizontalNeumorphCardView4.text = "Manual mode"
            }
        }


    }
}