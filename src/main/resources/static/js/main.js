var myApp = angular.module('app', []);

myApp.controller("informationController", function ($scope, $http) {

    $http.get('/information').then(function (response) {
        $scope.informations = response.data;
        console.log("Success", response);
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