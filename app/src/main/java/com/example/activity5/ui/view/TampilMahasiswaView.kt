package com.example.activity5.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity5.model.Mahasiswa

@Composable
fun TampilMahasiswaView(
    mhs: Mahasiswa,
    onClickButton: () -> Unit

) {
    Column(modifier = Modifier.fillMaxSize()) {
        TampilData(
            judul = "Nama",
            isinya = mhs.nama,
            onClickButton = onClickButton
        )


        TampilData(
            judul = "Gender",
            isinya = mhs.gender,
            onClickButton = onClickButton
        )
        TampilData(
            judul = "Alamat",
            isinya = mhs.alamat,
            onClickButton = onClickButton
        )
        TampilData(
            judul = "NIM",
            isinya = mhs.nim,
            onClickButton = onClickButton
        )
    }
}

@Composable
fun TampilData(
    judul: String,
    isinya: String,
    onClickButton: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = judul, fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f))
            Text(text = ":", modifier = Modifier.weight(0.1f))
            Text(text = isinya, modifier = Modifier.weight(2f))
        }

        Button(
            onClick = { onClickButton() },
            modifier = Modifier.padding(vertical = 10.dp)
        ) {
            Text("Kembali")
        }
    }
}
