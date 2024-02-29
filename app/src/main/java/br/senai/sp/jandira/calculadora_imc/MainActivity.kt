package br.senai.sp.jandira.calculadora_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadora_imc.ui.theme.Calculadora_IMCTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculadora_IMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color(0xFFEA1450)),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ){
   Column (
       modifier = Modifier
           .height(150.dp),
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.SpaceEvenly

   ){
       Card (

           shape = CircleShape,
           modifier = Modifier
               .size(width = 70.dp, height = 70.dp)


       ){
          Image(painter = painterResource(id = R.drawable.imc) ,
               contentDescription = "Imagem com um simbolo IMC"
           )
       }

       Text(
           text = "Calculadora IMC",
           fontSize = 24.sp,
           fontWeight = FontWeight.Bold,
           color = Color.White
       )
   }
    }

        Column (
            modifier = Modifier
                .size(height = 600.dp, width = 400.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ){
            Card (
                modifier = Modifier
                    .offset(y = -60.dp)
                    .size(height = 400.dp, width = 340.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFF9F6F6)),
                elevation = CardDefaults.cardElevation(9.dp)


            ){
               Row (
                   modifier = Modifier
                       .padding(bottom = 40.dp)
                       .padding(top = 18.dp)
                       .size(width = 340.dp, height = 30.dp),

                   horizontalArrangement = Arrangement.Center

               ){
                   Text(
                       text = "Seus dados",
                       fontSize = 24.sp,
                       fontWeight = FontWeight.Bold,
                       color = Color(0xFFFED145B)
                   )
               }
                Column(
                    modifier = Modifier
                        .size(height = 300.dp, width = 340.dp),
                    horizontalAlignment = Alignment.CenterHorizontally


                ){

                    Column (
                        modifier = Modifier
                            .padding(bottom = 20.dp),

                    ){
                        Text(text = "Seu peso",
                            color = Color(0xFFFED145B)
                            )

                        OutlinedTextField(value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(text = "Seu peso em Kg",
                                color = Color(0xFFFAFA9A9)
                                )
                            },
                            shape = RoundedCornerShape(8.dp),
                            colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFFED145B))
                        )
                    }

                    Column(
                        modifier = Modifier
                            .padding(bottom = 50.dp)
                    ){
                        Text(text = "Sua altura",
                            color = Color(0xFFFED145B)
                        )

                        OutlinedTextField(value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(text = "Sua altura em cm",
                                    color = Color(0xFFFAFA9A9)
                                )
                            },

                            shape = RoundedCornerShape(8.dp),
                            colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFFED145B))

                        )
                    }


                    Column (
                        modifier = Modifier
                            .width(300.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){

                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .height(50.dp)
                                .width(300.dp),
                            colors = ButtonDefaults
                                .buttonColors(
                                    containerColor = Color(0xFFFED145B)
                                ),
                            shape = RoundedCornerShape(8.dp)



                        ) {
                            Text(text = "Calcular")


                        }
                    }


                }

            }
            Card (
                modifier = Modifier
                    .size(width = 340.dp, height = 100.dp),
                elevation = CardDefaults.cardElevation(9.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF329F6B)),
                border = BorderStroke(width = 1.dp, Color(0xFFFED145B))

            ){
                Row (
                    modifier = Modifier
                        .width(400.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Column (
                        modifier = Modifier
                            .size(width = 200.dp, height = 100.dp),
                        verticalArrangement = Arrangement.SpaceEvenly

                    ){
                        Text(text = "Resultado",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light
                        )

                        Text(text = "Peso ideal",
                            color = Color.White,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }
                    Text(text = "21.3",
                        color = Color.White,
                        fontSize = 38.sp,
                        fontWeight = FontWeight.Bold
                        )






                }

            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Calculadora_IMCTheme {
        Greeting()
    }
}