docker build -t gcr.io/anthos-poc-252613/istiocanary:1.0 .
docker push gcr.io/anthos-poc-252613/istiocanary:1.0
docker build -t gcr.io/anthos-poc-252613/kubecanary:1.0 .
docker push gcr.io/anthos-poc-252613/kubecanary:1.0
docker build -t gcr.io/anthos-poc-252613/kubecanary:2.0 .
docker push gcr.io/anthos-poc-252613/kubecanary:2.0 



kubectl label namespace default istio-injection=enabled

istioctl kube-inject -f workloadv2.yaml > workloadv2-inject.yaml


104.197.109.158/welcome



step1) kubectl get svc -n istio-system
step2 export PATH=$PWD/bin:$PATH
$ echo $PATH

kubectl label namespace default istio-injection=enabled

point to side vm

https://istio.io/docs/setup/install/multicluster/shared-gateways/ 

https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-howto-point-to-site-resource-manager-portal 
