package com.remoo11203.meals_final_project.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.remoo11203.meals_final_project.ui.theme.Purple40

@Preview(showBackground = true)
@Composable
fun MealItem(modifier: Modifier = Modifier,title: String = "Meal", imageUrl: String = "" , function : () -> Unit = {}) {
    Card(
        modifier
            .fillMaxWidth()
            .height(310.dp)
            .padding(5.dp)
            .clickable { function() }, shape = RoundedCornerShape(10.dp), colors = CardDefaults.cardColors(Color.White), elevation = CardDefaults.cardElevation(5.dp)) {
        Column(modifier = Modifier.fillMaxSize().padding(start = 30.dp,end=30.dp,top = 30.dp) ,
            verticalArrangement = Arrangement.spacedBy(15.dp)) {


            AsyncImage(model = imageUrl, contentDescription = "Meal Image" , contentScale = ContentScale.Crop, modifier = Modifier
                .width(310.dp)
                .height(190.dp)
            )

            Text(text = title, fontSize = 25.sp, color = Purple40, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)

        }

    }
}