package com.example.activity5.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.activity5.model.DataJK

@Composable
fun FormulirView(
    modifier: Modifier = Modifier,
    pilihanJK:List<String>,
    onClickButton: (MutableList<String>) -> Unit


) {

    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var notelp by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }



    var jenisK by remember { mutableStateOf("") }
    var listData:  MutableList<String> = mutableListOf(nama, jenisK, alamat)


    Column (modifier = Modifier.fillMaxSize().padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Biodata",
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp)
        Spacer(modifier = Modifier.padding(16.dp))

        TextField(
            value = nim,
            onValueChange = {nim = it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text( text = "nim")
            },
            placeholder = {
                Text(text = "Masukan Nim Anda")
            }
        )



        TextField(
            value = nama,
            onValueChange = {nama = it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text( text = "nama")
            },
            placeholder = {
                Text(text = "Masukan Nama Anda")
            }
        )
        Row {
            pilihanJK.forEach{ selectedJK ->
                Row {
                    RadioButton(selected = jenisK == selectedJK,
                        onClick = {
                            jenisK = selectedJK
                        })
                    Text(selectedJK)
                }
            }
        }
        TextField(
            value = email,
            onValueChange = { email= it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text( text = "email")
            },
            placeholder = {
                Text(text = "Masukan Email Anda")
            }
        )
        TextField(
            value = notelp,
            onValueChange = {notelp = it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text( text = "Nomor HP")
            },
            placeholder = {
                Text(text = "Masukan notelp Anda")
            },


            )

        TextField( // menerima input teks dari penguna
            value = alamat, // mengatur nilai di textfield
            onValueChange = {alamat = it},// memperbarui nilai setiap kali melakukan perubahan
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = { // menambahkan label name di textfield
                Text( text = "Alamat")
            },
            placeholder = {
                Text(text = "Masukan Alamat Anda")
            }
        )
        Button(onClick = {
            onClickButton(listData)


        },
            modifier = Modifier.padding(vertical = 10.dp)) {
            Text(text = "Simpan")
        }




    }


}
