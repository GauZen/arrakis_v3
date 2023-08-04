import http from './axios-common';

export function getAllBonds(){
    return http.get("/api/v1/bonds");
}