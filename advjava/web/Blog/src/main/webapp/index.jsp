<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BlogTube - Your Blogging Platform</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
   
</head>
<body>
	<!-- Header section start -->
   		<%@ include file="header.jsp" %>
    <!-- Header section end -->
    
    
    <div class="container">
    
    
        <!-- sidebar section start -->
   		<%@ include file="sidebar.jsp" %>
    <!-- sidebar section end -->
    
    
        <main class="main-content">
            <div class="content-header">
                <h2>Recommended Blogs</h2>
                <div class="filter-buttons">
                    <button class="filter-btn active">All</button>
                    <button class="filter-btn">Today</button>
                    <button class="filter-btn">This week</button>
                    <button class="filter-btn">This month</button>
                    <button class="filter-btn">Most viewed</button>
                    <button class="filter-btn">Top rated</button>
                    <button class="filter-btn">Newest</button>
                </div>
            </div>
            
            <div class="posts-grid">
                <!-- Blog Post 1 -->
                <div class="post-card">
                    <div class="thumbnail">
                        <img src="https://images.unsplash.com/photo-1506744038136-46273834b3fb" alt="Mountain landscape">
                        <span class="duration">5 min read</span>
                    </div>
                    <div class="post-details">
                        <h3 class="post-title">10 Tips for Better Photography in 2023</h3>
                        <div class="post-meta">
                            <div class="author-avatar"></div>
                            <div class="post-info">
                                <div class="author-name">Photo Pro</div>
                                <div class="post-stats">15K views • 3 days ago</div>
                            </div>
                            <i class="fas fa-ellipsis-v more-options"></i>
                        </div>
                    </div>
                </div>
                
                <!-- Blog Post 2 -->
                <div class="post-card">
                    <div class="thumbnail">
                        <img src="https://images.unsplash.com/photo-1546069901-ba9599a7e63c" alt="Healthy food">
                        <span class="duration">8 min read</span>
                    </div>
                    <div class="post-details">
                        <h3 class="post-title">The Ultimate Guide to Vegan Cooking for Beginners</h3>
                        <div class="post-meta">
                            <div class="author-avatar"></div>
                            <div class="post-info">
                                <div class="author-name">Vegan Kitchen</div>
                                <div class="post-stats">42K views • 1 week ago</div>
                            </div>
                            <i class="fas fa-ellipsis-v more-options"></i>
                        </div>
                    </div>
                </div>
                
                <!-- Blog Post 3 -->
                <div class="post-card">
                    <div class="thumbnail">
                        <img src="https://images.unsplash.com/photo-1506929562872-bb421503ef21" alt="Travel destination">
                        <span class="duration">12 min read</span>
                    </div>
                    <div class="post-details">
                        <h3 class="post-title">How I Traveled to 15 Countries in One Year With a Full-Time Job</h3>
                        <div class="post-meta">
                            <div class="author-avatar"></div>
                            <div class="post-info">
                                <div class="author-name">Travel Enthusiast</div>
                                <div class="post-stats">105K views • 2 weeks ago</div>
                            </div>
                            <i class="fas fa-ellipsis-v more-options"></i>
                        </div>
                    </div>
                </div>
                
                <!-- Blog Post 4 -->
                <div class="post-card">
                    <div class="thumbnail">
                        <img src="https://images.unsplash.com/photo-1555774698-0b77e0d5fac6" alt="Coding on laptop">
                        <span class="duration">6 min read</span>
                    </div>
                    <div class="post-details">
                        <h3 class="post-title">Building Your First Mobile App: A Step-by-Step Guide</h3>
                        <div class="post-meta">
                            <div class="author-avatar"></div>
                            <div class="post-info">
                                <div class="author-name">Code Master</div>
                                <div class="post-stats">28K views • 5 days ago</div>
                            </div>
                            <i class="fas fa-ellipsis-v more-options"></i>
                        </div>
                    </div>
                </div>
                
                <!-- Blog Post 5 -->
                <div class="post-card">
                    <div class="thumbnail">
                        <img src="https://images.unsplash.com/photo-1513519245088-0e12902e5a38" alt="Minimalist workspace">
                        <span class="duration">10 min read</span>
                    </div>
                    <div class="post-details">
                        <h3 class="post-title">Minimalist Living: How to Declutter Your Life and Find Happiness</h3>
                        <div class="post-meta">
                            <div class="author-avatar"></div>
                            <div class="post-info">
                                <div class="author-name">Simple Life</div>
                                <div class="post-stats">76K views • 3 weeks ago</div>
                            </div>
                            <i class="fas fa-ellipsis-v more-options"></i>
                        </div>
                    </div>
                </div>
                
                <!-- Blog Post 6 -->
                <div class="post-card">
                    <div class="thumbnail">
                        <img src="https://images.unsplash.com/photo-1454165804606-c3d57bc86b40" alt="Productive workspace">
                        <span class="duration">7 min read</span>
                    </div>
                    <div class="post-details">
                        <h3 class="post-title">The Science Behind Productivity: How to Get More Done in Less Time</h3>
                        <div class="post-meta">
                            <div class="author-avatar"></div>
                            <div class="post-info">
                                <div class="author-name">Productivity Guru</div>
                                <div class="post-stats">53K views • 4 days ago</div>
                            </div>
                            <i class="fas fa-ellipsis-v more-options"></i>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
    
    <div class="create-new">
        <i class="fas fa-plus"></i>
    </div>

    <script>
        // Toggle sidebar on mobile
        document.querySelector('.menu-toggle').addEventListener('click', function() {
            document.querySelector('.sidebar').classList.toggle('active');
        });
        
        // Close sidebar when clicking outside on mobile
        document.addEventListener('click', function(event) {
            const sidebar = document.querySelector('.sidebar');
            const menuToggle = document.querySelector('.menu-toggle');
            
            if (window.innerWidth <= 768 && 
                !sidebar.contains(event.target) && 
                !menuToggle.contains(event.target) &&
                sidebar.classList.contains('active')) {
                sidebar.classList.remove('active');
            }
        });
        
        // Make filter buttons scrollable
        const filterButtons = document.querySelector('.filter-buttons');
        let isDown = false;
        let startX;
        let scrollLeft;
        
        filterButtons.addEventListener('mousedown', (e) => {
            isDown = true;
            startX = e.pageX - filterButtons.offsetLeft;
            scrollLeft = filterButtons.scrollLeft;
        });
        
        filterButtons.addEventListener('mouseleave', () => {
            isDown = false;
        });
        
        filterButtons.addEventListener('mouseup', () => {
            isDown = false;
        });
        
        filterButtons.addEventListener('mousemove', (e) => {
            if(!isDown) return;
            e.preventDefault();
            const x = e.pageX - filterButtons.offsetLeft;
            const walk = (x - startX) * 2;
            filterButtons.scrollLeft = scrollLeft - walk;
        });
        
        // Active filter button
        document.querySelectorAll('.filter-btn').forEach(btn => {
            btn.addEventListener('click', function() {
                document.querySelectorAll('.filter-btn').forEach(b => b.classList.remove('active'));
                this.classList.add('active');
            });
        });
    </script>
</body>
</html>