package br.senai.sp.jandira.calculadora_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Card (
                modifier = Modifier
                    .size(height = 300.dp, width = 300.dp)
            ){
               Column (
                   modifier = Modifier
                       .size(width = 300.dp, height = 20.dp),
                   horizontalAlignment = Alignment.CenterHorizontally,

               ){
                   Text(
                       text = "Seus dados"
                   )

                   Text(
                       text = "Seu peso:"
                   )
               }

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Calculadora_IMCTheme {
        Greeting()
    }
}