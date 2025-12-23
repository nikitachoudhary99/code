<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Register - Space App</title>
  <link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@400;600&family=Inter:wght@400;600&display=swap" rel="stylesheet">

  <style>
    body {
      margin: 0;
      height: 100vh;
      display: flex;
      align-items: center;
      justify-content: center;
      font-family: "Inter", sans-serif;
      background: radial-gradient(circle at bottom, #000010, #000);
      overflow: hidden;
      color: white;
    }
    .scene { position: relative; width: 100%; height: 100%; perspective: 1000px; }
    .stars, .stars2, .stars3 {
      position: absolute; width: 200%; height: 200%; background-repeat: repeat; background-size: contain;
      animation: moveStars 100s linear infinite;
    }
    .stars { background-image: url("https://www.transparenttextures.com/patterns/stardust.png"); animation-duration: 200s; }
    .stars2 { background-image: url("https://www.transparenttextures.com/patterns/stardust.png"); animation-duration: 150s; }
    .stars3 { background-image: url("https://www.transparenttextures.com/patterns/stardust.png"); animation-duration: 100s; }
    @keyframes moveStars { from { transform: translateY(0); } to { transform: translateY(-1000px); } }
    .shooting-star { position: absolute; top: 20%; left: -10%; width: 150px; height: 2px; background: linear-gradient(90deg, white, transparent); animation: shoot 5s linear infinite; }
    @keyframes shoot { 0% { transform: translateX(0) translateY(0) rotate(45deg); opacity: 1; } 80% { opacity: 1; } 100% { transform: translateX(1200px) translateY(600px) rotate(45deg); opacity: 0; } }
    .planet { position: absolute; bottom: -50px; right: -100px; width: 200px; height: 200px; background: radial-gradient(circle, #4f46e5, #1e1b4b); border-radius: 50%; box-shadow: inset -20px -20px 40px rgba(0,0,0,0.6); }
    .planet .ring { position: absolute; top: 50%; left: 50%; width: 300px; height: 80px; border: 4px solid rgba(255,255,255,0.3); border-radius: 50%; transform: translate(-50%, -50%) rotateX(65deg); }
    .card { position: relative; background: rgba(255,255,255,0.05); padding: 2rem; border-radius: 20px; box-shadow: 0 8px 32px rgba(0,0,0,0.5); backdrop-filter: blur(10px); width: 350px; text-align: center; transform-style: preserve-3d; }
    .card h1 { font-family: "Orbitron", sans-serif; font-size: 1.5rem; margin-bottom: 1.5rem; color: #fff; }
    .field { position: relative; margin-bottom: 1.5rem; }
    .field input, .field select { width: 100%; padding: 0.8rem; border: none; outline: none; border-radius: 10px; background: rgba(255,255,255,0.1); color: white; font-size: 1rem; }
    .field label { position: absolute; left: 12px; top: 12px; color: rgba(255,255,255,0.7); pointer-events: none; transition: 0.3s ease; }
    .field input:focus + label, .field input:not(:placeholder-shown) + label { top: -10px; left: 8px; font-size: 0.8rem; color: #60a5fa; }
    .btn { background: linear-gradient(45deg, #3b82f6, #8b5cf6); border: none; padding: 0.8rem 1.5rem; border-radius: 12px; color: white; font-size: 1rem; cursor: pointer; transition: transform 0.2s ease; width: 100%; }
    .btn:hover { transform: scale(1.05); }
    .meta { margin-top: 1rem; font-size: 0.9rem; }
    .meta a { color: #93c5fd; text-decoration: none; }
    .meta a:hover { text-decoration: underline; }
  </style>
</head>
<body>
<center>
  <div class="scene" id="scene">
    <div class="stars"></div>
    <div class="stars2"></div>
    <div class="stars3"></div>
    <div class="shooting-star"></div>
    <div class="planet"><div class="ring"></div></div>

    <form class="card" action="saveUser" method="post" autocomplete="off">
      <h1>Create Account</h1>
      
      <div class="field">
        <input id="username" name="username" type="text" required placeholder=" " />
        <label for="username">Username</label>
      </div>
      
      <div class="field">
        <input id="password" name="password" type="password" required placeholder=" " />
        <label for="password">Password</label>
      </div>

      <!-- Role dropdown -->
      <div class="field">
        <select name="role" required>
          <option value="" disabled selected>Select Role</option>
          <option value="USER">User</option>
          <option value="ADMIN">Admin</option>
        </select>
      </div>

      <button class="btn" type="submit">Register</button>
      <div class="meta">
        <a href="login">Already have an account? Login</a>
      </div>
    </form>
  </div>

  <script>
    // tilt effect for 3D
    const card = document.querySelector(".card");
    document.addEventListener("mousemove", (e) => {
      let x = (window.innerWidth / 2 - e.pageX) / 25;
      let y = (window.innerHeight / 2 - e.pageY) / 25;
      card.style.transform = `rotateY(${x}deg) rotateX(${y}deg)`;
    });
    document.addEventListener("mouseleave", () => {
      card.style.transform = "rotateY(0deg) rotateX(0deg)";
    });
  </script>
  </center>
</body>
</html>
