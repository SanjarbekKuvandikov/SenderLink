var myApp = angular.module('app', []);

myApp.controller("informationController", function ($scope, $http) {
    $scope.emails = [];
    $scope.phoneNumbers = [];
    $http.get('/information').then(function (response) {
        $scope.informations = response.data;
        // Filter for emails (including id)
        $scope.emails = $scope.informations.filter(function(info) {
            return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(info.phoneOrEmail); // Email regex
        });

        // Filter for phone numbers (including id)
        $scope.phoneNumbers = $scope.informations.filter(function(info) {
            return /^\+?\d+$/.test(info.phoneOrEmail); // Adjusted phone number regex
        });
        console.log("Emails: ", $scope.emails);
        console.log("Phone Numbers: ", $scope.phoneNumbers);
    }, function (error) {
        console.log("Error", error);
    });
});

myApp.controller("infoController", function ($scope, $http) {
    console.log("Controller initialized");
    $scope.sendInformation = function (firstName,lastName,phoneOrEmail) {
        console.log("Button clicked"); // Add this line
        var Information = {
            firstName: firstName,
            lastName: lastName,
            phoneOrEmail: phoneOrEmail
        };
        $scope.successMessage = "";
            if (firstName && lastName && phoneOrEmail) {
                $scope.successMessage = "Form sent successfully! We will get in touch with you shortly.";
            } else {
                $scope.successMessage = "Please fill out all fields!";
            }
        $http.post('/information', {
            firstName: Information.firstName,
            lastName: Information.lastName,
            phoneOrEmail: Information.phoneOrEmail
        }).then(function(response) {
            console.log("Success", response);
        }, function(error) {
            console.log("Error", error);
        });
    }
});