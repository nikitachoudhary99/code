
//#include <iostream>


// Abstract base class
class Shape {
public:
    // Pure virtual function
    virtual void draw() = 0;

    // Virtual destructor
    virtual ~Shape() {}
};

// Derived class
class Circle : public Shape {
public:
    void draw() override {
        std::cout << "Drawing Circle" << std::endl;
    }
};

// Another derived class
class Square : public Shape {
public:
    void draw() override {
        std::cout << "Drawing Square" << std::endl;
    }
};

int main() {
    Shape* shape1 = new Circle();
    Shape* shape2 = new Square();

    shape1->draw(); // Output: Drawing Circle
    shape2->draw(); // Output: Drawing Square

    delete shape1;
    delete shape2;

    return 0;
}