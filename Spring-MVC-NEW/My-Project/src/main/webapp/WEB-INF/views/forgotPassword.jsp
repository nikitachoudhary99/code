<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Change Password - Space App</title>
  <link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@400;600&family=Inter:wght@400;600&display=swap" rel="stylesheet">
  <style>
    body, html {
      margin: 0;
      padding: 0;
      height: 100%;
      font-family: 'Inter', sans-serif;
      background: black;
      overflow: hidden;
    }

    /* Scene Background */
    .scene {
      position: relative;
      width: 100%;
      height: 100%;
      overflow: hidden;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    /* Stars layers */
    .stars, .stars2, .stars3 {
      position: absolute;
      width: 200%;
      height: 200%;
      background: transparent url('https://www.transparenttextures.com/patterns/stardust.png') repeat;
      z-index: 0;
    }

    .stars { animation: moveStars 100s linear infinite; }
    .stars2 { animation: moveStars 200s linear infinite; opacity: 0.7; }
    .stars3 { animation: moveStars 300s linear infinite; opacity: 0.5; }

    @keyframes moveStars {
      from { background-position: 0 0; }
      to { background-position: -10000px 5000px; }
    }

    /* Shooting star */
    .shooting-star {
      position: absolute;
      width: 2px;
      height: 100px;
      background: linear-gradient(white, transparent);
      opacity: 0.8;
      transform: rotate(45deg);
      animation: shoot 6s linear infinite;
    }

    @keyframes shoot {
      0% { top: -200px; left: 100%; opacity: 0; }
      10% { opacity: 1; }
      50% { top: 50%; left: 50%; opacity: 1; }
      100% { top: 120%; left: -200px; opacity: 0; }
    }

    /* Planet */
    .planet {
      position: absolute;
      bottom: -60px;
      right: 8%;
      width: 220px;
      height: 220px;
      background: radial-gradient(circle at 30% 30%, #7d5fff, #2d1b64);
      border-radius: 50%;
      z-index: 0;
      box-shadow: 0 0 60px rgba(125, 95, 255, 0.6);
    }

    /* Form card */
    .card {
      position: relative;
      background: rgba(255, 255, 255, 0.08);
      backdrop-filter: blur(14px);
      border-radius: 20px;
      padding: 40px 30px;
      width: 340px;
      z-index: 1;
      box-shadow: 0 0 25px rgba(255,255,255,0.2);
      text-align: center;
      color: white;
    }

    .card h1 {
      font-family: 'Orbitron', sans-serif;
      margin-bottom: 25px;
      font-size: 22px;
      text-transform: uppercase;
      letter-spacing: 1px;
    }

    .field {
      margin-bottom: 20px;
    }

    .field input {
      width: 100%;
      padding: 12px;
      border: none;
      border-radius: 8px;
      outline: none;
      background: rgba(255, 255, 255, 0.2);
      color: white;
      font-size: 14px;
    }

    .field input::placeholder {
      color: #ddd;
    }

    .btn {
      width: 100%;
      padding: 12px;
      border: none;
      border-radius: 10px;
      background: linear-gradient(45deg, #7d5fff, #00c6ff);
      color: white;
      font-weight: bold;
      font-size: 15px;
      cursor: pointer;
      transition: transform 0.2s ease, background 0.3s ease;
    }

    .btn:hover {
      transform: scale(1.05);
      background: linear-gradient(45deg, #00c6ff, #7d5fff);
    }

    p.message {
      margin-top: 18px;
      color: #ff4f4f;
      font-size: 14px;
    }

    .back-link {
      margin-top: 15px;
      display: block;
      color: #00c6ff;
      text-decoration: none;
      font-size: 14px;
    }

    .back-link:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>
  <div class="scene">
    <div class="stars"></div>
    <div class="stars2"></div>
    <div class="stars3"></div>
    <div class="shooting-star"></div>
    <div class="planet"></div>

    <form class="card" action="changePassword" method="post">
      <h1>Change Password</h1>
 		
 		<div class="field">
        <input type="username" name="username" placeholder="username" required />
      </div>
      
      <div class="field">
        <input type="password" name="newPassword" placeholder="New Password" required />
      </div>
      <div class="field">
        <input type="password" name="confirmPassword" placeholder="Confirm Password" required />
      </div>

      <button class="btn" type="submit">Update Password</button>

      
		<div class="back-link">
			 <a href="backL" >← Back to Home</a>
		</div>
     
    </form>
  </div>
</body>
</html>
