<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>3D Space Login</title>
  <link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@400;600&family=Inter:wght@400;600&display=swap" rel="stylesheet">
  <style>
    :root{
      --bg1:#090a1a;
      --bg2:#0b1a3a;
      --accent:#03e9f4;
      --accent-2:#8a5cf6;
      --text:#e7f3ff;
      --muted:#9fb3c8;
      --card-w: 360px;
    }

    *{box-sizing:border-box}
    html,body{height:100%}
    body{
      margin:0;
      font-family: Inter, Arial, sans-serif;
      color:var(--text);
      background: radial-gradient(1200px 800px at 70% 10%, #1b2a68 0%, transparent 60%),
                  radial-gradient(900px 700px at 20% 80%, #3a0a53 0%, transparent 55%),
                  linear-gradient(135deg, var(--bg1), var(--bg2));
      overflow:hidden;
    }

    .scene{ position:relative;height:100%;display:grid;place-items:center;perspective:1000px; }

    /* starfield layers */
    .stars,.stars2,.stars3{
      position:absolute; inset:0; pointer-events:none; z-index:-3;
      background-repeat:repeat;
      animation: drift 120s linear infinite;
    }
    .stars{background-image:radial-gradient(2px 2px at 20px 30px,#fff 50%,transparent 51%),
      radial-gradient(1.5px 1.5px at 130px 80px,#dff 50%,transparent 51%),
      radial-gradient(1.5px 1.5px at 300px 200px,#fff 50%,transparent 51%);}
    .stars2{z-index:-2;opacity:.6;filter:blur(.3px);animation-duration:180s;}
    .stars3{z-index:-1;opacity:.35;filter:blur(1px);animation-duration:240s;}
    @keyframes drift{to{background-position:-2000px 1000px;}}

    /* shooting star */
    .shooting-star{position:absolute;top:10%;left:-10%;width:2px;height:2px;background:#fff;border-radius:50%;
      box-shadow:0 0 6px 2px #fff,0 0 18px 6px var(--accent);animation:shoot 5s ease-in-out infinite;}
    .shooting-star::after{content:"";position:absolute;right:2px;top:50%;height:2px;width:140px;
      transform:translateY(-50%);background:linear-gradient(90deg,#fff,transparent);}
    @keyframes shoot{0%{transform:translate(-10vw,-10vh) rotate(15deg)}20%{transform:translate(30vw,5vh) rotate(15deg)}21%{opacity:0}100%{opacity:0}}

    /* planet */
    .planet{position:absolute;right:8vw;bottom:12vh;width:160px;height:160px;border-radius:50%;
      background:radial-gradient(120px 120px at 35% 35%,#7bdcff 0%,#1f6fb2 55%,#0a2550 100%);
      box-shadow:inset -10px -20px 40px rgba(0,0,0,.45),0 0 60px 10px rgba(138,92,246,.35);}
    .ring{position:absolute;inset:0;border-radius:50%;
      background:conic-gradient(from 0deg,rgba(3,233,244,.0),rgba(3,233,244,.7),rgba(138,92,246,.6),rgba(3,233,244,.0));
      transform:rotateX(70deg) scale(1.35);}

    /* login card */
    .card{
      width:var(--card-w);
      padding:34px 28px;
      background:rgba(255,255,255,.08);
      border:1px solid rgba(255,255,255,.15);
      border-radius:20px;
      backdrop-filter:blur(12px);
      box-shadow:0 10px 35px rgba(0,0,0,.55);
      transform-style:preserve-3d;
      transition:.4s;
    }
    .card:hover{transform:rotateY(10deg) rotateX(5deg);}
    h1{font-family:Orbitron,sans-serif;text-align:center;margin-bottom:20px;}

    .field{margin:18px 0;position:relative;}
    .field input,.field select{
      width:100%;padding:12px 14px;font-size:15px;color:var(--text);
      background:rgba(255,255,255,.05);border:1px solid rgba(255,255,255,.25);
      border-radius:10px;outline:none;transition:.3s;}
    .field input:focus,.field select:focus{border-color:var(--accent);background:rgba(255,255,255,.12);}

    .btn{
      width:100%;margin-top:16px;padding:12px 16px;
      background:linear-gradient(135deg,rgba(3,233,244,.6),rgba(138,92,246,.5));
      color:#fff;font-weight:600;border:0;border-radius:12px;
      cursor:pointer;transition:.2s;
    }
    .btn:hover{box-shadow:0 0 25px rgba(3,233,244,.6);}
    .meta{margin-top:14px;display:flex;justify-content:space-between;font-size:13px;color:var(--muted);}
    .meta a{color:#b7d8ff;text-decoration:none;}
    .meta a:hover{text-decoration:underline;}
  </style>
</head>
<body>
  <div class="scene" id="scene">
    <div class="stars"></div>
    <div class="stars2"></div>
    <div class="stars3"></div>
    <div class="shooting-star"></div>
    <div class="planet"><div class="ring"></div></div>

    <form class="card" action="checkUser" method="post">
      <h1>Login</h1>
      <div class="field">
        <select name="role" required>
          <option value="USER">User</option>
          <option value="ADMIN">Admin</option>
        </select>
      </div>
      <div class="field">
        <input id="username" name="username" type="text" placeholder="Username" required />
      </div>
      <div class="field">
        <input id="password" name="password" type="password" placeholder="Password" required />
      </div>
      <button class="btn" type="submit">Launch</button>
      <div class="meta">
        <a href="forgotpassword">Forgot password?</a>
        <a href="register">Create account</a>
      </div>
    </form>
  </div>
</body>
</html>
