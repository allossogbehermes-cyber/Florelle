<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<title>Florelle ❤️ Mon amour</title>

<style>
body{
 margin:0;
 height:100vh;
 background:linear-gradient(135deg,#ff4d6d,#ff9a9e);
 display:flex;
 justify-content:center;
 align-items:center;
 font-family:Arial, sans-serif;
 overflow:hidden;
}

.card{
 background:rgba(255,255,255,0.25);
 padding:40px;
 border-radius:25px;
 text-align:center;
 color:white;
 max-width:420px;
 box-shadow:0 0 20px rgba(255,255,255,0.4);
 animation:float 3s ease-in-out infinite;
}

@keyframes float{
 0%,100%{transform:translateY(0);}
 50%{transform:translateY(-12px);}
}

h1{font-size:2.7em;}
p{font-size:1.1em;}

.heart{
 position:absolute;
 font-size:22px;
 animation:fall linear infinite;
}

@keyframes fall{
 from{top:-10%;}
 to{top:110%;}
}
</style>
</head>

<body>
<div class="card">
<h1>Florelle ❤️</h1>

<p>Depuis que tu es entrée dans ma vie, mon cœur ne sait plus battre sans penser à toi.</p>

<p>Chaque sourire de toi est une lumière dans mes jours, chaque mot de toi est une douceur dans mon âme.</p>

<p>Quand je pense à toi, tout devient plus beau, plus fort, plus vrai.</p>

<p>Je n’ai pas besoin de promesses grandioses, juste de toi à mes côtés pour toujours.</p>

<h2>Je t’aime infiniment ❤️</h2>

<p>— Pour toi, avec tout mon cœur</p>
</div>


<audio autoplay loop>
<source src="https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3">
</audio>

<script>
for(let i=0;i<30;i++){
 let heart=document.createElement("div");
 heart.className="heart";
 heart.innerHTML="❤️";
 heart.style.left=Math.random()*100+"%";
 heart.style.animationDuration=(3+Math.random()*5)+"s";
 heart.style.fontSize=(15+Math.random()*20)+"px";
 document.body.appendChild(heart);
}
</script>

</body>
</html>
