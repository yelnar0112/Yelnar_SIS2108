package com.example.a2108_intents

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.TextView
import java.net.URL

class SecondScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second_screen)
        val bioTextView = findViewById<TextView>(R.id.bioTextView)

        val bioText = "Meet Yelnar, a 20-year-old trailblazer carving a path of academic excellence at IITU University. With a relentless pursuit of knowledge, Yelnar's journey is marked by remarkable achievements and a commitment to making a positive impact. Within the halls of IITU, Yelnar's academic prowess shines brightly, earning admiration and respect from peers and mentors alike. But Yelnar's ambitions extend beyond the classroom; driven by innovation and a compassionate heart, they seek to push the boundaries of possibility and effect meaningful change in the world. Yelnar's story is one of resilience, determination, and boundless potential. As they continue to write the chapters of their biography, Yelnar serves as an inspiration to all, reminding us that with passion and perseverance, the sky is the limit. In the academic arena, Yelnar's insatiable curiosity serves as the guiding light, illuminating pathways to discovery and enlightenment. With a voracious appetite for knowledge and a tenacious spirit, Yelnar has consistently surpassed expectations, garnering accolades and recognition from peers and mentors alike. Yet, Yelnar's pursuits extend far beyond the confines of traditional academia. Armed with an indomitable spirit and a visionary mindset, Yelnar has embraced innovation as a means to catalyze positive change. Whether it be through groundbreaking research endeavors or pioneering technological advancements, Yelnar remains at the vanguard of progress, charting new frontiers and redefining the boundaries of possibility. However, perhaps most admirable of all is Yelnar's unwavering commitment to making a difference in the world. Beneath the veneer of academic excellence lies a compassionate heart and a fervent desire to effectuate meaningful change. Driven by an innate sense of responsibility and a deep-seated empathy for others, Yelnar channels their talents and resources towards endeavors that uplift and empower communities, leaving an indelible legacy of compassion and goodwill in their wake. As the pages of Yelnar's biography continue to unfold, one thing remains abundantly clear: theirs is a story of resilience, determination, and boundless potential. With each passing chapter, Yelnar's journey serves as an inspiration to all who dare to dream, reminding us that with unwavering resolve and an unwavering commitment to excellence, anything is possible."
        bioTextView.text = bioText

    }
}