package com.example.kuit6_week1

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
    Box(
        Modifier
            .width(240.dp)
            .height(140.dp)
            .clip(RoundedCornerShape(10.dp))
            .border(width = 1.dp, color = Color.Black)
            .padding(10.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(R.drawable.image2),
                contentDescription = "KUIT",
                modifier = Modifier
                    .size(40.dp)
                    .align(Alignment.End)
            )
            Text(
                "이름 : 정일혁",
                fontSize = 10.sp
            )
            Text(
                "학번 : 202111373",
                fontSize = 8.sp
            )
            Text(
                "학과 : 컴퓨터공학부",
                fontSize = 8.sp
            )
            Text(
                "생년월일 : 2000/05/03",
                fontSize = 8.sp
            )
        }
    }
}

@Preview
@Composable
private fun ProfileCardPreview() {
    ProfileCard()
}